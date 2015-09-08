%
% This is file `AIAA-hacks.cls',
% it fixes bugs in the corresponding publication documentclass
%
%		- Remove default \includegraphics size, because this destroys \psfragfig[width=...]
%		- Use preferred BibTeX style by default
%
% The following files contain the original style definition:
% 	- AIAA.cls
% 	- aiaa.bst 
%
% REVISIONS:    2013-01-30 First version
%               2013-04-21 Degrade to sty from cls
%               
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2013 DLR Robotics and Mechatronics         __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{AIAA-hacks}
        [2013/04/21 v0.2 DLR hacks for AIAA journal paper class]

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

%
% Load the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\LoadClass{\hacks@currname}

%
% POST: Do hacks after loading the orignal class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Fix the \paperwidth etc makros
\usepackage[a4paper]{geometry}

% Use the preferred BibTeX style
\bibliographystyle{aiaa}

%% The template uses babel features...
%\AtBeginDocument{%
	%\RequirePackage{babel}}