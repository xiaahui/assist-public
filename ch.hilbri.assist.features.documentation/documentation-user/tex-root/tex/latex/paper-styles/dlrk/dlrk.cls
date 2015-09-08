%
% This class is created from the template for the Modelica 2014 conference
%
%
\ProvidesClass{dlrk}[2014/05/10 v1.0 DLR class created from DLRK 2014 word template]

% Set up basic geometry
\LoadClass[10pt,a4paper,parskip=half]{scrartcl}
\RequirePackage{geometry}
\geometry{left=20mm, right=20mm, top=25mm, bottom=30mm}
\setlength{\columnsep}{5mm}

% Use Frutiger font
\RequirePackage[family]{frutiger}

% Empty page style
\pagestyle{empty}

% Define title
\let\dlrk@maketitle\maketitle
\renewcommand{\maketitle}{
  \twocolumn[
    \dlrk@maketitle
    \large%
    \begin{center}{%
      \bfseries \abstractname\vspace{-0.7em}\vspace{\z@}%
    }\end{center}%
    \@abstract
    \vspace{3.0em}%
  ]
  \thispagestyle{empty}
}

% Change title command
\renewcommand{\@maketitle}{%
  \begin{center}%
    \let\footnote\thanks%
    {%
      \Large\bfseries%
      \expandafter\uppercase\expandafter{\@title}%
      \par%
    }%
    \vskip 1.5em%
    {%
      \Large\lineskip .5em%
      \begin{tabular}[t]{c}%
        \@author%
      \end{tabular}%
      \par%
    }%
    \vskip 1em%
    {%
      \large\@date%
    }%
  \end{center}%
  \par\vskip 1.5em%
}

% Redefine \date for it not to be used
\date{}
\renewcommand{\date}[1]{ \ClassWarningNoLine{dlrk}{Do not use the date command}}

% Renew abstract command to store the abstract
\renewcommand{\abstract}[1]{
  \def\@abstract{#1}
}

% Renew sections and the like
% upper case: https://groups.google.com/forum/#!topic/de.comp.text.tex/s-CTs8LiE74
\usepackage{makerobust}
\MakeRobustCommand\@hangfrom
\newcommand*{\SectionMakeUppercase}{%
  \MakeRobustCommand\@svsec
  \MakeUppercase
}
\setkomafont{section}      {\vspace{-1em}\large\bfseries\SectionMakeUppercase}
\setkomafont{subsection}   {\vspace{-1em}\large\bfseries}
\setkomafont{subsubsection}{\vspace{-1em}\large\bfseries}

% Make sure, the bibstyle is used
\RequirePackage[square,super]{natbib}
\AtBeginDocument{
  \RequirePackage{hyperref}}
\renewcommand{\@biblabel}[1]{#1.}
\let\dlrk@bibliography\bibliography
\renewcommand{\bibliography}[1]{
  \bibliographystyle{unsrturl}
  \dlrk@bibliography{#1}
}


