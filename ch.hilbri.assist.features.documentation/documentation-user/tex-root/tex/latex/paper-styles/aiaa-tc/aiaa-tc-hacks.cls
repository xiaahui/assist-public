%
% This is file `aiaa-tc-hacks.cls',
% it fixes bugs in the corresponding publication documentclass
%
%		- Remove default \includegraphics size, because this destroys \psfragfig[width=...]
%		- Use preferred BibTeX style by default
%
% The following files contain the original style definition:
% 	- aiaa-tc.cls
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
\ProvidesClass{aiaa-tc-hacks}
        [2013/04/21 v0.2 DLR hacks for AIAA technical conference paper class]

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
% Check for recency of package
\@ifclasslater{\hacks@currname}{2004/11/23}{}{%
	\PackageWarning{\hacks@currname-hacks}
	               {You appear not to have loaded the most recent \hacks@currname\space class!}
}

% Hack the AIAA-graphicx defaults
% This enables also \psfragfig[width=...]
\setkeys{Gin}{width=!,totalheight=!,keepaspectratio=false}

% Use the preferred BibTeX style
\bibliographystyle{aiaa}

% Provide commands for textcite
\newcommand{\tcite}[1]{%
	% Count entries
	\@tempcnta\z@%
	\@for\aiaa@tc@hack@tcite@item:=#1\do{\advance\@tempcnta\@ne}%
	\def\aiaa@tc@hack@tcite@sep{,~}%            % ... no last sperator
	% Define last seperator and refname
	\ifcase\@tempcnta%                         % Swichtcase of number: if 0
		\citen{#1}%                              % ... create default warinig
		\def\aiaa@tc@hack@tcite@sep{}%           % ... no sperator
		\def\aiaa@tc@hack@tcite@lastsep{}%       % ... no last sperator
		\def\aiaa@tc@hack@tcite@refname{}%       % ... no name
	\or%                                       % if 1
		\def\aiaa@tc@hack@tcite@sep{}%           % ... no sperator
		\def\aiaa@tc@hack@tcite@lastsep{}%       % ... no last sperator
		\def\aiaa@tc@hack@tcite@refname{Ref.~}%  % ... name: "Ref."
	\or%                                       % if 2
		\def\aiaa@tc@hack@tcite@sep{,~}%         % ... sperator: ,~
		\def\aiaa@tc@hack@tcite@lastsep{~and~}%  % ... last sperator: "~and~"
		\def\aiaa@tc@hack@tcite@refname{Refs.~}% % ... name: "Refs."
	\else%                                     % if 3 or more
		\def\aiaa@tc@hack@tcite@sep{,~}%         % ... sperator: ,~
		\def\aiaa@tc@hack@tcite@lastsep{,~and~}% % ... last sperator: ",~and~"
		\def\aiaa@tc@hack@tcite@refname{Refs.~}% % ... name: "Refs."
	\fi%
	% Create output
	\@tempcntb\@ne%                            % Bias cnt b
	\aiaa@tc@hack@tcite@refname%               % Output refname
	\@for\aiaa@tc@hack@tcite@item:=#1\do{%     % Loop over cite items
		\advance\@tempcntb\@ne%                  % ... increment cnt b
		\citen{\aiaa@tc@hack@tcite@item}%        % ... Output cite item
		\ifnum\@tempcnta=\@tempcntb%             % ... if second last cite itme
			\aiaa@tc@hack@tcite@lastsep%           % ... ... output last seperator
			\def\aiaa@tc@hack@tcite@sep{}%         % ... ... clear seperator
		\else%                                   % ... else
			\aiaa@tc@hack@tcite@sep%               % ... ... output seperator
		\fi%                                     % ... end
	}}


% The template uses babel features...
%\AtBeginDocument{\RequirePackage{babel}}
