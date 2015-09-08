%
% This is file `dlrpaper.cls',
% it loads a given publication style file together with hacks for it.
%
%
% REVISIONS:    2013-01-30 First version
%               2013-04-21 Generalized from aiaa-tc-dlr
% TO DO:        Define common title interface: after \begin{document}, 
%                                              \title\author\contact\affiliation + matching
%
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2013 DLR Robotics and Mechatronics         __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR


%
% Package Header
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{dlrpaper}
        [2013/04/21 v0.1 DLR customization of publication styles]

%
% Define options of this package
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Use xkeyval for that
\RequirePackage{xkeyval}

% Define an option for the base class
\define@key{dlrpaper.cls}{style}{\def\dlrpaper@style{#1}}

% Define an option for elib publication
\define@key{dlrpaper.cls}{elib}{\def\dlrpaper@elib{#1}}

% Any undefined options are passed to original class
\DeclareOptionX*{%
	\PassOptionsToClass{\CurrentOption}{\dlrpaper@style}%
}

% Process options
\ProcessOptionsX\relax

%
% DLR elib publication
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Use the elib class and load \jobname.tex
\@ifundefined{dlrpaper@elib@loaded}{\@ifundefined{dlrpaper@elib}{}{
	\RequirePackage{jobpath}
	\def\dlrpaper@elib@loaded{yes!}
	\LoadClass[publisher=\dlrpaper@elib,includetex={\jobpathfile.tex}]{elib}
}}{}

%
% Load the original class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Check for a valid style choice
\@ifundefined{dlrpaper@style}{
	\PackageWarningNoLine{dlrpaper}
	                     {You have not loaded a style option. Loading default article class.}
	\setkeys{dlrpaper.cls}{style=article}
}{}

% Load hacks, if existing
\IfFileExists{\dlrpaper@style-hacks.cls}{%
	\LoadClass{\dlrpaper@style-hacks}
	
% Load original class, if existing
}{
	\IfFileExists{\dlrpaper@style.cls}{%
		\LoadClass{\dlrpaper@style}

% Load article class as fallback
	}{
		\PackageError{dlrpaper}
		             {You have not loaded a valid style option. Loading default article class.}
		             {Use the style option with a valid style file name}%
		\LoadClass{article}
	}
}


%
% Load the original class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\RequirePackage{dlrpaper}

% Examples for author infos
%		\begin{document}
%		\title{Benchmark Scenarios for UAV Cooperative Missions}
%		% aiaa-tc:
%		%\author{Sebastian Herbst\thanks{position, address} \and Andreas Kl\"ockner\thanks{position, address} \and Andreas Kl\"ockner\thanksibid{2}}
%		%AIAA:
%		%\author{Sebastian Herbst\footnote{position, adress}}
%		%\affiliation{TUM, address}
%		%\author{Andreas Kl\"ockner\footnote{position, address}}
%		%\affiliation{DLR, address}
%		\maketitle




