%
% This is file `dlrbook.sty',
% it includes style sheets for a DLR book layout.
%
% It defines the following options:
%   frutiger = {[true], false}
%	    Use or do not use the frutiger package. The frutiger package is always loaded
%     with the family option.
%   title = {[true], false}
%     Create or do not create a DLR title page.
%   page = {[true], false}
%     Do or do not change the page layout.
%   elements = {[true], false}
%     Do or do not change elements such as titles, tables, figures, captions.
%
% It provides the following commands:
%   \reportno:
%     Creates a \@reportno variable just like the \author command.
%   \titlematter
%     Defines page and chapter numbering for title
%   \frontmatter
%     Defines page and chapter numbering for prematter
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
\ProvidesClass{dlrbook}
        [2011/11/03 v0.2 DLR Book Layout]

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
\define@boolkey{dlrbook.cls}[dlrbook@]{frutiger}[true]{}
\ExecuteOptionsX{frutiger}

% layout
\define@boolkey{dlrbook.cls}[dlrbook@]{elements}[true]{}
\ExecuteOptionsX{elements}

% title
\define@boolkey{dlrbook.cls}[dlrbook@]{title}[true]{}
\ExecuteOptionsX{title}

% pages
\define@boolkey{dlrbook.cls}[dlrbook@]{page}[true]{}
\ExecuteOptionsX{page}

% any other options are passed to scrbook
\DeclareOptionX*{%
  \PassOptionsToClass{\CurrentOption}{scrbook}%
  %\PackageWarningNoLine{dlrreprt}{Unknown option `\CurrentOption'}%
}

%
% Process and execute options
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% process options
\ProcessOptionsX\relax

% Load scrbook class
\LoadClass{scrbook}

% Execute frutiger options
\ifdlrbook@frutiger
  \RequirePackage{cmbright}         % Enable cmbright for math fonts
  \renewcommand{\ttdefault}{cmtt}   % Reset TT default, because cmtl is not defined in bold
  \RequirePackage[family]{frutiger} % Overwrite other defaults with frutiger
\fi

% Execute elements options
\ifdlrbook@elements
  \RequirePackage{dlrelements}
\fi

% Execute title options
\ifdlrbook@title
 \RequirePackage{dlrtitle}
\fi

% Execute page options
\ifdlrbook@page
 \RequirePackage{dlrheaders}
\fi

%
% Define or renew some commands
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% reportnumber
\def\@reportno{} \def\reportno#1{\gdef\@reportno{#1} }
	
% generate titlematter
\let\titlematter\frontmatter

% package to modify pagenumbering
\RequirePackage{etoolbox}

% titlematter: roman
\ifpatchable{\titlematter}{\pagenumbering{roman}}{%
   \patchcmd{\titlematter}{\pagenumbering{roman}}{\pagenumbering{roman}}{}{\ClassWarning{dlrbook}{Failed patching titlematter command}}%
}{%
   \apptocmd{\titlematter}                       {\pagenumbering{roman}}{}{\ClassWarning{dlrbook}{Failed patching titlematter command}}%
}

% frontmatter: Roman
\ifpatchable{\frontmatter}{\pagenumbering{roman}}{%
   \patchcmd{\frontmatter}{\pagenumbering{roman}}{\pagenumbering{Roman}}{}{\ClassWarning{dlrbook}{Failed patching frontmatter command}}%
}{%
   \apptocmd{\frontmatter}                       {\pagenumbering{Roman}}{}{\ClassWarning{dlrbook}{Failed patching frontmatter command}}%
}

% appendix: Alph
\apptocmd{\appendix}                             {\cleardoublepage}     {}{\ClassWarning{dlrbook}{Failed patching appendix command}}%
\apptocmd{\appendix}                             {\pagenumbering{Alph}} {}{\ClassWarning{dlrbook}{Failed patching appendix command}}%

% fix Acrobat display to book layout if hyperref is loaded
\AtBeginDocument{
  \if@twoside                          % If two-sided layout
    \@ifpackageloaded{hyperref}{
      \@ifpackagewith{hyperref}{pdfpagelayout=SinglePage}{}{
      \@ifpackagewith{hyperref}{pdfpagelayout=OneColumn}{}{
      \@ifpackagewith{hyperref}{pdfpagelayout=TwoColumnLeft}{}{
      \@ifpackagewith{hyperref}{pdfpagelayout=TwoColumnRight}{}{
      \@ifpackagewith{hyperref}{pdfpagelayout=TwoPageLeft}{}{
      \@ifpackagewith{hyperref}{pdfpagelayout=TwoPageRight}{}{
        \hypersetup{pdfpagelayout=TwoColumnRight}%
      }}}}}}  
    }{}
  \fi
}

\endinput

% eof
