%
% This is file `reprt.sty',
% it includes style sheets for a DLR reprt layout.
%
% It defines the following options:
%   frutiger = {[true], false}
%	    Use or do not use the frutiger package. The frutiger package is always loaded
%     with the family option.
%   title = {[true], false}
%     Create or do not create a DLR title page.
%   page = {[true], false}
%     Do or do not change the page layout.
%
% It provides the following commands:
%   \reportno:
%     Creates a \@reportno variable just like the \author command.
%
% REVISIONS:    2008-12-08 DLR7-1-0 Dr. Patrick van der Smagt <smagt@dlr.de>
%                          prior    Andreas Knoblach <andreas.knoblach@dlr.de>
%                                   Reiko Müller <reiko.mueller@dlr.de>
%               2011-10-20 package  Andreas Klöckner <andreas.kloeckner@dlr.de>
%               2011-10-25 class    Andreas Klöckner <andreas.kloeckner@dlr.de>
%                                   added page layout and cmbright for math
%               2011-11-03 keyval   Andreas Knoblach <andreas.knoblach@dlr.de>
%                                   use of xkeyvalue added
%               
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2011 DLR Robotics and Mechatronics         __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{dlrreprt}
        [2011/11/03 v0.2 DLR Report Layout]

%
% Load Packages
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Some at Begin Document, to ensure that options can be user selected
\AtBeginDocument{ 
	\RequirePackage{dlrlogos, xcolor}}
	
% Packages without options can be loaded at any time	
\RequirePackage{xkeyval}

%
% Declare class options
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% frutiger
\define@boolkey{dlrreprt.cls}[dlrreprt@]{frutiger}[true]{}
\ExecuteOptionsX{frutiger}

% layout
\define@boolkey{dlrreprt.cls}[dlrreprt@]{elements}[true]{}
\ExecuteOptionsX{elements}

% title
\define@boolkey{dlrreprt.cls}[dlrreprt@]{title}[true]{}
\ExecuteOptionsX{title}

% pages
\define@boolkey{dlrreprt.cls}[dlrreprt@]{page}[true]{}
\ExecuteOptionsX{page}

% any other options are passed to scrreprt
\DeclareOptionX*{%
  \PassOptionsToClass{\CurrentOption}{scrreprt}%
  %\PackageWarningNoLine{dlrreprt}{Unknown option `\CurrentOption'}%
}

%
% Process and execute options
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% process options
\ProcessOptionsX\relax

% Load scrreprt class
\LoadClass{scrreprt}

% Execute frutiger options
\ifdlrreprt@frutiger
 \RequirePackage{cmbright}          % Enable cmbright for math fonts
  \renewcommand{\ttdefault}{cmtt}   % Reset TT default, because cmtl is not defined in bold
  \RequirePackage[family]{frutiger} % Overwrite other defaults with frutiger
\fi

% Execute elements options
\ifdlrreprt@elements
  \RequirePackage{dlrelements}
\fi

% Execute title options
\ifdlrreprt@title
 \RequirePackage{dlrtitle}
\fi

% Execute page options
\ifdlrreprt@page
 \RequirePackage{dlrheaders}
\fi

%
% Define or renew some commands
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% reportnumber
\def\@reportno{} \def\reportno#1{\gdef\@reportno{#1} }
	

% eof
