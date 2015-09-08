%
% This is file `lni-hacks.cls',
% it fixes bugs in the corresponding publication documentclass
%
%		- Restore mangled \pdfoutput
%		- Fix bad \ifpdf definition
%
% The following files contain the original style definition:
% 	- lni.cls
% 	- lni.bst 
% 	- lnig.bst 
%
% REVISIONS:    2013-04-21 First version
%               
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2013 DLR Robotics and Mechatronics         __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{lni-hacks}
        [2013/04/21 v0.2 DLR hacks for GI LNI proceedings paper class]

%
% Retrieve original document class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Define command to remove the "-hacks" and set \hacks@currname
\def\hacks@remove#1-hacks{\def\hacks@currname{#1}}

% Define \hacks@currname
\expandafter\hacks@remove\@currname

%
% Make sure, all options are passed to the original class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Use xkeyval for that
\RequirePackage{xkeyval}

% Any undefined options are passed to original class
\DeclareOptionX*{%
	\PassOptionsToClass{\CurrentOption}{\hacks@currname}%
}

% Process options
\ProcessOptionsX\relax

%
% PRE: Do hacks before loading the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Store original \pdfoutput
\edef\original@pdfoutput{\the\pdfoutput}

%
% Load the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\LoadClass{\hacks@currname}

%
% POST: Do hacks after loading the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Reset original \pdfoutput
\expandafter\pdfoutput\original@pdfoutput

% Fix the bad \ifpdf definition and use the package
\let\ifpdf\undefined
\RequirePackage{ifpdf}
