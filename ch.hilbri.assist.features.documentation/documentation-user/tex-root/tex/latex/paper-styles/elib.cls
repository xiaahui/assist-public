%
% This is file `elib.cls',
% it creates a cover page with appropriate copyright notices.
%
%
% REVISIONS:    2013-06-04 Created
%
% Contact       Andreas Klöckner,  Andreas.Kloeckner@dlr.de
% Copyright (C) 2008-2013 DLR Robotics and Mechatronics         __/|__
%                                                              /_/_/_/  
%                                                                |/ DLR

% Also add the bibtex for convenience?
% Use bibtopic.sty, multibbl.sty, multibib.sty, splitbib.sty with calling bibtex automatically
% http://www.tex.ac.uk/cgi-bin/texfaq2html?label=multbib
% No page numbers:
% \pagenumbering{Alph} or \hypersetup{pageanchor=false}
% \thispagestyle{empty}
% Do my stuff
% \cleardoublepage
% \pagenumbering{arabic} 

% Add: This is the author's copy of the article. Please consult the original publication for citation.

% Package Header
\NeedsTeXFormat{LaTeX2e}
\ProvidesClass{elib}
        [2014/08/09 v0.4 elib cover page: copyright and citation notices]

% Issue a standard legal warning
\PackageWarningNoLine{elib}{%
	%LEGAL NOTICE:                                            \MessageBreak %
	You are using the DLR's "elib" document class. This      \MessageBreak %
	package tries to automatically insert appropriate legal  \MessageBreak %
	hints as a cover page into your paper. The class comes   \MessageBreak %
	with no warranty! Please ensure that the information     \MessageBreak %
	displayed on the cover page matches your publisher's     \MessageBreak %
	requirements. In order to do so, you should have a look  \MessageBreak %
	at the copyright agreement, which you have most probably \MessageBreak %
	signed before publication of your paper!                 \MessageBreak %
	If you find disagreements to this package's standard     \MessageBreak %
	texts, please update the package accordingly%
}


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% DEFINE THE PUBLISHERS
% PLEASE FEEL FREE TO INSERT NEW PUBLISHERS HERE!
% IF YOU DO SO, PLEASE ALSO UPLOAD THE COPYRIGHT ASSIGNMENT TO THE SVN
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


%
% USE THIS TEMPLATE IN ORDER TO CREATE A NEW PUBLISHER!
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Please provide information on the wording of the copyright agreement here!
% Don't forget to upload the agreement form to the SVN!
\def\elib@publisher@mypublisher{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ My Publisher. 
		Here should go whatever text is required to be in the copyright notice
	}
	%\elib@citation@needed            % Uncomment this line, if a full citation is required by your publisher
	%\PackageWarningNoLine{elib}      % Use the \PackageWarningNoLine
  %                     {Some text} % ... to add information for the author, such as remembering them to put a link to the original paper
}

%
% SPRINGER BOOKS: SVMULT CLASS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% SPRINGER JOURNALS: https://www.springer.com/gp/open-access/authors-rights/self-archiving-policy/2124
% "Authors may self-archive the author’s accepted manuscript of their articles on their own websites. Authors may also deposit this version 
% of the article in any repository, provided it is only made publicly available 12 months after official publication or later. He/ she may 
% not use the publisher's version (the final article), which is posted on SpringerLink and other Springer websites, for the purpose of self-
% archiving or deposit. Furthermore, the author may only post his/her version provided acknowledgement is given to the original source of 
% publication and a link is inserted to the published article on Springer's website.  The link must be provided by inserting the DOI number of
% the article in the following sentence: “The final publication is available at Springer via http://dx.doi.org/[insert DOI]”."
%
% SPRINGER BOOKS: http://www.springer.com/authors/book+authors/helpdesk?SGWID=0-1723113-12-799504-0
% No clear policy defined.
\def\elib@publisher@svmult{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ Springer. 
		The final publication is available at Springer via \url{http://dx.doi.org/\elib@doi}.
	}
	%\elib@citation@needed            % Uncomment this line, if a full citation is required by your publisher
	\elib@citation@needed
	\PackageWarningNoLine{elib}
	                     {You are required to include a DOI link to the final      \MessageBreak
	                      publication. You can provide the DOI in an elib.bib file.\MessageBreak
	                      Please make sure, this is the case}
	%\PackageWarningNoLine{elib}      % Use the \PackageWarningNoLine
  %                     {Some text} % ... to add information for the author, such as remembering them to put a link to the original paper
}

%
% IJUSEng: INTERNATIONAL JOURNAL OF UNMANNED SYSTEMS ENGINEERING
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% As the author, you continue to have the right to use the article elsewhere after publication, including
% posting it on your personal web pages, or using it in other works or for the purposes of your
% teaching and research. There is no need to ask for Marques Aviation Ltd – Press's permission; the
% only condition is that acknowledgement is given to the journal in which it is published as the original
% source of publication. A link to the IJUSEng website or a display of the URL (www.ijuseng.com) is
% encouraged.
% Please note that:
% - You continue to enjoy patent and trademark rights to any process described in your article; these are
% unaffected by the transfer of copyright to Marques Aviation Ltd – Press.
% - If the article has been researched and written by you as part of your employment - i.e., as a "work
% for hire" - your employer may use all or part of the information in the article for intra-company use.
% - You may, of course, present the paper at a seminar or conference and hand copies of the paper to delegates.
% - Other uses that you require should be authorised by Marques Aviation Ltd – Press.
\def\elib@publisher@ijuseng{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ Marques Engineering Ltd. 
		This research was originally published in the International Journal of Unmanned Systems Engineering (IJUSEng) at http://www.ijuseng.com.
	}
	\elib@citation@needed            % Uncomment this line, if a full citation is required by your publisher
	%\PackageWarningNoLine{elib}      % Use the \PackageWarningNoLine
  %                     {Some text} % ... to add information for the author, such as remembering them to put a link to the original paper
}


%
% MODELICA PROCEEDINGS
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Modelica is open source. We retain all copyrights andonly grant permissions to the Modelica Association.
% http://www.ep.liu.se/copyright/index.en.asp
% 1. All authors, including students, who publish their work at www.ep.liu.se (LiU E-Press), retain the copyright to their work.
\def\elib@publisher@modelica{\def\elib@copyright{
		\elib@head@copyright
		The author has retained copyright of the publication and releases it to the public according to the terms of the DLR elib archive.
	}
}


%
% IEEE definitions
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% This was given as a good example by A. Heckmann
% 2. Authors/employers may reproduce or authorize others to reproduce the Work, material extracted verbatim from the Work, or derivative works for the author’s personal use or for company use, provided that the source and the IEEE copyright notice are indicated, the copies are not used in any way that implies IEEE endorsement of a product or service of any employer, and the copies themselves are not offered for sale.
% 6. Personal Servers. Authors and/or their employers shall have the right to post the accepted version of IEEE-copyrighted articles on their own personal servers or the servers of their institutions or employers without permission from IEEE, provided that the posted version includes a prominently displayed IEEE copyright notice and, when published, a full citation to the original IEEE publication, including a link to the article abstract in IEEE Xplore. Authors shall not post the final, published versions of their papers.
\def\elib@publisher@ieee{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ IEEE. 
		Personal use of this material is permitted. However, permission
		to reprint/republish this material for advertising or promotional purposes or
		for creating new collective works for resale or redistribution to servers or lists,
		or to reuse any copyrighted component of this work in other works must be
		obtained from the IEEE.
	}
	\elib@citation@needed
	\PackageWarningNoLine{elib}
	                     {You are required to include a link to the IEEE Xplore abstract of your
	                      publication in the citation. Please make sure, this is the case. You can 
	                      do so by giving the DOI of your publication in the elib.bib file}
}


%
% ACC definitions
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% This is from the ACC 2013 website
% Authors may post pre-prints (files generated by the authors themselves) on their personal websites, but the standard AACC copyright does not allow post-prints (with the conference proceedings header/footer and page numbers) to be posted without formal authorization from AACC. 
% The papers are posted on IEEE Xplore, so the same remark should work
\def\elib@publisher@acc{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ AACC. 
		Personal use of this material is permitted. However, permission
		to reprint/republish this material for advertising or promotional purposes or
		for creating new collective works for resale or redistribution to servers or lists,
		or to reuse any copyrighted component of this work in other works must be
		obtained from the AACC.
	}
	\elib@citation@needed
	\PackageWarningNoLine{elib}
	                     {You are required to include a link to the IEEE Xplore abstract of your
	                      publication in the citation. Please make sure, this is the case. You can 
	                      do so by giving the DOI of your publication in the elib.bib file}
}


%
% GI LNI definitions
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Autor/inn/en können einen in den LNI erschienenen Beitrag über ihre persönliche Homepage verfügbar machen, sofern die genaue Quelle und die Gesellschaft für Informatik als Copyrightinhaberin angegeben sind.
\def\elib@publisher@lni{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ Gesellschaft f\"ur Informatik e.V. (GI). This work has been published in the 
		GI Lecture Notes in Informatics (LNI) as referenced in the citation notice below. 
		%The author is allowed to redistribute this publication on their personal homepage, provided they indicate the 
		%exact citation and the copyright attribution to the GI.
	}
	\elib@citation@needed
	\PackageWarningNoLine{elib}
	                     {You are allowed to distribute the publication on your personal homepage. 
	                      Whether or not elib is your personal homepage is up to you}
}


%
% AIAA Technical Conferences definitions
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\def\elib@publisher@aiaa{
	\elib@publisherfalse
	\define@key{elib.cls}{agreement}{
		\@ifundefined{elib@publisher@aiaa@##1}{
			\PackageError{elib}
			             {The given AIAA agreement '##1' is not defined}
			             {Please add the agreement to the elib.sty package}
		}{
			\elib@publishertrue
			\csname elib@publisher@aiaa@##1\endcsname
		}
	}
}

% Define the AIAA agreement form A choice
% Copyright Form A: I irrevocably transfer and assign copyright to my work exclusively to AIAA, giving the Institute all rights to it except that I and the organization by which I was employed at the time I wrote the manuscript have the right of further print reproductions, in part or in full, provided they are not for sale. This reproduction right does not include distribution of the work via the Internet or by other electronic means. 
\def\elib@publisher@aiaa@A{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ AIAA. 
		The author and the organization by which they were employed at the time they wrote the manuscript 
		have the right of further print reproductions, in part or in full, provided they are not for sale. 
		%This reproduction right does not include distribution of the work via the Internet or by other electronic means. 
	}
	\PackageError{elib}
	             {The copyright of this publication was assigned to AIAA. You are not allowed to redistribute this publication through elib}
}

% Define the AIAA agreement form B choice
% Copyright Form B: I hereby license AIAA to publish this work and to use it for all of AIAA’s current and future print and electronic uses. 
\def\elib@publisher@aiaa@B{\def\elib@copyright{
		\elib@head@copyright
		The author has retained copyright of the publication and releases it to the public according to the terms of the DLR elib archive.
	}
}



%
% ASD Journal definitions
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Open Access Policy
% This journal provides immediate open access to its content on the principle that making research freely available to the public supports a greater global exchange of knowledge.
\def\elib@publisher@asdj{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ ASD Journal. 
		Open Access Policy: This journal provides immediate open access to its content on the principle that making research freely available to the public supports a greater global exchange of knowledge.
	}}
	

%
% MSSP (Mechanical Systems and Signal Processing Journal)  definitions for subscription articles 
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Copied from http://www.elsevier.com/journal-authors/author-rights-and-responsibilities
% Authors transfer copyright to the publisher as part of a journal publishing agreement, 
% but have the right to:
%		-	Share their article for personal and scholarly purposes (including scholarly rights
%			to create certain derivative works), so long as they give proper attribution and
%			credit to the published work
%		-	Retain patent, trademark and other intellectual property rights (including raw
%			research data).
%		-	Proper attribution and credit for the published work.
\def\elib@publisher@mssp@subsecripted{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ Elsevier.
	Authors transfer copyright to the publisher as part of a journal publishing agreement, but have the right to share the article for personal and scholarly purposes (including scholarly rights to create certain derivative works), so long as they give proper attribution and credit to the published work. A preprint may be puplished on a webpage.
	}
	\elib@citation@needed
	\PackageWarningNoLine{elib}
	                     {You are required to include propter citation of the puplished article. Please make sure, this is the case. You can do so by giving the DOI of your publication in the elib.bib file}
}

%
% IFAC-PapersOnLine
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Copied from http://www.ifac-papersonline.net/static/copyright.html
% The Copyright for all papers published on IFAC-PapersOnLine belongs to IFAC. No fee is charged for downloads made for personal research and study or classroom use. No other form of reproduction or redistribution is allowed without written permission from IFAC. Please refer to the IFAC Secretariat for requesting such permissions.
% The exception to this is that authors may post a copy of their own paper on their own personal website or may deposit a copy in a departmental or institutional repository without requesting such permission. 
\def\elib@publisher@ifac{\def\elib@copyright{
		\elib@head@copyright
		\elib@copyright@sign \the\year\ IFAC. Published on IFAC-PapersOnline.net.
	}
}


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% WE ARE NOW DONE WITH THE PUBLISHER DEFINITIONS AND GO ON WITH THE CLASS IMPLEMENTATION...
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%



%
% Define globally used macros and defaults
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Define a command to output a heading
\RequirePackage{calc}
\def\elib@head#1{%
	\fcolorbox{black}{lightgray}{%                 % ... A box with
		\parbox{\textwidth-2\fboxsep-2\fboxrule}{%   % ... another box with
			\centering\bfseries #1}}\par}%             % ... the heading
\def\elib@head@copyright{\elib@head{Copyright Notice}}
\def\elib@head@citation {\elib@head{Citation  Notice}}

% Define my own copyright symbol
\RequirePackage{tikz}
\def\elib@copyright@sign{
	\tikz[baseline=(char.south)]{
		\node[shape=circle,draw,inner sep=1pt] (char) {c};}}

% Define the default copyright notice
\def\elib@copyright{}

% Define the default citation notice
\def\elib@citation{}

% Define a command to make citation compulsory
\def\elib@citation@needed{
	\gdef\elib@citation{\elib@head@citation
	There was no correct citation given by the author!!
	\PackageError{elib}
	             {For your publication type a correct citation must be provided}
	             {Please place a correct citation within a file elib.bib in the document folder}
}}


%
% Some magic to make the file available at a nice name
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Make the file smaller
%\AfterEndDocument{%
	%\execute{start "Copying the file to match elib's bibtex key..." cmd "/c                    % Start new window
	         %echo Waiting...                                                      \string&%    % ... Echo information
	         %ping localhost                                                 > nul \string&%    % ... Wait some time to finish
	         %copy "\jobname.pdf" "\elib@name_elib.pdf"                            \string&%    % ... Copy the file
           %% Maybe use pdftools to compress the file?
	         %echo."}%                                                                          % Close new window
%}

%
% Define options
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\RequirePackage{xkeyval}

% Create an if for the publisher being fully defined
\newif\ifelib@publisher
\elib@publisherfalse

% Define the publisher option
\define@key{elib.cls}{publisher}{
	\@ifundefined{elib@publisher@#1}{
		\@ifundefined{elib@copyright@#1}{
			\PackageError{elib}
			             {The given publisher '#1' is not defined}
			             {Please add the publisher to the elib.sty package}
		}{
			\elib@publishertrue
			\expandafter\let\expandafter\elib@copyright\csname elib@copyright@#1\endcsname
		}
	}{
		\elib@publishertrue
		\csname elib@publisher@#1\endcsname
	}
}

% Create an if for a tex file being included
\newif\ifelib@tex
\elib@texfalse

% Define an option to include a tex file
\define@key{elib.cls}{includetex}{
	\elib@textrue
  \def\elib@tex{#1}
}

% Define an option to include a pdf file
\RequirePackage{pdfpages}
\define@key{elib.cls}{includepdf}{
	\AtEndDocument{%
		\includepdf[pages={-},noautoscale=true,fitpaper=true]{#1}
	}
}

% Process the options
\ProcessOptionsX\relax


%
% Try to guess the publisher from the documentclass
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% This needs to be done \AtBeginDocument, because the class could be 
% loaded via the includetex option.
% Only do this, if the publisher was not option-defined
\AtBeginDocument{\ifelib@publisher\else

	% Check for ieeeconf
	\@ifclassloaded{ieeeconf}{
		\ExecuteOptionsX{publisher=ieee}
	}{}

	% Check for IEEEconf
	\@ifclassloaded{IEEEconf}{
		\ExecuteOptionsX{publisher=ieee}
	}{}

	% Check for lni
	\@ifclassloaded{lni}{
		\ExecuteOptionsX{publisher=lni}
	}{}

	% Check for aiaa-tc
	\@ifclassloaded{aiaa-tc}{
		\ExecuteOptionsX{publisher=aiaa}
	}{}

	% Check for svmult
	\@ifclassloaded{svmult}{
		\ExecuteOptionsX{publisher=svmult}
	}{}

% Done looking for the document class
\fi

% Double-check, if we have now found something...
\ifelib@publisher\else
	\PackageWarningNoLine{elib}
	                     {No publisher given! Also the document class is not known to me}
\fi}



%
% Some magic to automatically find author and title of the paper
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Check for a file elib.bib and load its data
\newif\ifelib@bib%                                                             % Use an \if for this
\IfFileExists{elib.bib}{%                                                      % If elib.bib exists
  \elib@bibtrue%                                                               % ... set \if = true
}{%                                                                            % else
  \elib@bibfalse%                                                              % ... set \if = false
}%                                                                             % .done

\def\elib@title   {\@title}
\def\elib@author  {\@author}
\def\elib@type    {}
\def\elib@bibkey  {}
\def\elib@abstract{}%\@abstract}
\def\elib@keywords{}
\def\elib@doi     {NOT DEFINED!}
\ifelib@bib%                                                                   % If .bib is there
  % For lower-cased bibtex files                                               % LOWER CASE:
  \define@key{elib}{title}   {\gdef\elib@title   {#1}}%                        % ... create title key
  \define@key{elib}{author}  {\gdef\elib@author  {#1}}%                        % ... create author key
  \define@key{elib}{type}    {\gdef\elib@type    {#1}}%                        % ... create type key
  \define@key{elib}{bibkey}  {\gdef\elib@bibkey  {#1}}%                        % ... create bibkey key
  \define@key{elib}{abstract}{\gdef\elib@abstract{#1}}%                        % ... create abstract key
  \define@key{elib}{keywords}{\gdef\elib@keywords{#1}}%                        % ... create keywords key
  \define@key{elib}{doi}     {\gdef\elib@doi     {#1}}%                        % ... create doi key
  % FOR CamelCased bibtex files                                                % CAMEL CASE:
  \define@key{elib}{Title}   {\gdef\elib@title   {#1}}%                        % ... create title key
  \define@key{elib}{Author}  {\gdef\elib@author  {#1}}%                        % ... create author key
  \define@key{elib}{Type}    {\gdef\elib@type    {#1}}%                        % ... create type key
  \define@key{elib}{Bibkey}  {\gdef\elib@bibkey  {#1}}%                        % ... create bibkey key
  \define@key{elib}{Abstract}{\gdef\elib@abstract{#1}}%                        % ... create abstract key
  \define@key{elib}{Keywords}{\gdef\elib@keywords{#1}}%                        % ... create keywords key
  \define@key{elib}{Doi}     {\gdef\elib@doi     {#1}}%                        % ... create doi key
  {%                                                                           % ... open a group for local magic
    \catcode 64=0 %                                                            % ... ... where @ is the same as \
    \def@PARSEBIBTEX#1#2{\setkeys*{elib}{type=#1,bibkey=#2}}%                  % ... ... create a command to barse .bib
    \def @ARTICLE      {@PARSEBIBTEX{article}      }%                          % ... ... use it for many entry types
    \def @BOOK         {@PARSEBIBTEX{book}         }%                          % ... ... use it for many entry types
    \def @BOOKLET      {@PARSEBIBTEX{booklet}      }%                          % ... ... use it for many entry types
    \def @CONFERENCE   {@PARSEBIBTEX{conference}   }%                          % ... ... use it for many entry types
    \def @INBOOK       {@PARSEBIBTEX{inbook}       }%                          % ... ... use it for many entry types
    \def @INCOLLECTION {@PARSEBIBTEX{incollection} }%                          % ... ... use it for many entry types
    \def @INPROCEEDINGS{@PARSEBIBTEX{inproceedings}}%                          % ... ... use it for many entry types
    \def @MANUAL       {@PARSEBIBTEX{manual}       }%                          % ... ... use it for many entry types
    \def @MASTERSTHESIS{@PARSEBIBTEX{mastersthesis}}%                          % ... ... use it for many entry types
    \def @MISC         {@PARSEBIBTEX{misc}         }%                          % ... ... use it for many entry types
    \def @PHDTHESIS    {@PARSEBIBTEX{phdthesis}    }%                          % ... ... use it for many entry types
    \def @PROCEEDINGS  {@PARSEBIBTEX{proceedings}  }%                          % ... ... use it for many entry types
    \def @TECHREPORT   {@PARSEBIBTEX{techreport}   }%                          % ... ... use it for many entry types
    \def @UNPUBLISHED  {@PARSEBIBTEX{unpublished}  }%                          % ... ... use it for many entry types
    \def @article      {@PARSEBIBTEX{article}      }%                          % ... ... use it for many entry types
    \def @book         {@PARSEBIBTEX{book}         }%                          % ... ... use it for many entry types
    \def @booklet      {@PARSEBIBTEX{booklet}      }%                          % ... ... use it for many entry types
    \def @conference   {@PARSEBIBTEX{conference}   }%                          % ... ... use it for many entry types
    \def @inbook       {@PARSEBIBTEX{inbook}       }%                          % ... ... use it for many entry types
    \def @incollection {@PARSEBIBTEX{incollection} }%                          % ... ... use it for many entry types
    \def @inproceedings{@PARSEBIBTEX{inproceedings}}%                          % ... ... use it for many entry types
    \def @manual       {@PARSEBIBTEX{manual}       }%                          % ... ... use it for many entry types
    \def @mastersthesis{@PARSEBIBTEX{mastersthesis}}%                          % ... ... use it for many entry types
    \def @misc         {@PARSEBIBTEX{misc}         }%                          % ... ... use it for many entry types
    \def @phdthesis    {@PARSEBIBTEX{phdthesis}    }%                          % ... ... use it for many entry types
    \def @proceedings  {@PARSEBIBTEX{proceedings}  }%                          % ... ... use it for many entry types
    \def @techreport   {@PARSEBIBTEX{techreport}   }%                          % ... ... use it for many entry types
    \def @unpublished  {@PARSEBIBTEX{unpublished}  }%                          % ... ... use it for many entry types
    \def @Article      {@PARSEBIBTEX{article}      }%                          % ... ... use it for many entry types
    \def @Book         {@PARSEBIBTEX{book}         }%                          % ... ... use it for many entry types
    \def @Booklet      {@PARSEBIBTEX{booklet}      }%                          % ... ... use it for many entry types
    \def @Conference   {@PARSEBIBTEX{conference}   }%                          % ... ... use it for many entry types
    \def @Inbook       {@PARSEBIBTEX{inbook}       }%                          % ... ... use it for many entry types
    \def @Incollection {@PARSEBIBTEX{incollection} }%                          % ... ... use it for many entry types
    \def @Inproceedings{@PARSEBIBTEX{inproceedings}}%                          % ... ... use it for many entry types
    \def @Manual       {@PARSEBIBTEX{manual}       }%                          % ... ... use it for many entry types
    \def @Mastersthesis{@PARSEBIBTEX{mastersthesis}}%                          % ... ... use it for many entry types
    \def @Misc         {@PARSEBIBTEX{misc}         }%                          % ... ... use it for many entry types
    \def @Phdthesis    {@PARSEBIBTEX{phdthesis}    }%                          % ... ... use it for many entry types
    \def @Proceedings  {@PARSEBIBTEX{proceedings}  }%                          % ... ... use it for many entry types
    \def @Techreport   {@PARSEBIBTEX{techreport}   }%                          % ... ... use it for many entry types
    \def @Unpublished  {@PARSEBIBTEX{unpublished}  }%                          % ... ... use it for many entry types
    \input{elib.bib}%                                                          % ... ... load the bib file!
  }%                                                                           % ... .done
\fi%                                                                           % .done


%
% Some magic to automatically create a citation notice from elib.bib
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% This needs to be done after the publisher is selected, thus after 
% the automatic check, thus \AtBeginDocument.
% Check for a file elib.bib and create the citation notice
\RequirePackage{etoolbox}
\AtEndPreamble{%                                                               % Some packages even need to be loaded before the AUX file?!
	\RequirePackage{listings}%                                                   % ... we will need the listings package
}
\AtBeginDocument{
\IfFileExists{elib.bib}{%                                                      % If the file elib.bib exists
	\RequirePackage{external-base}%                                              % ... we will need the external-base package
	\RequirePackage{suffix}%                                                     % ... we will need the suffix package
	\RequirePackage{hyperref}%                                                   % ... we will need the hyperref package
	\immediate\newwrite\elibcitation%                                            % ... Create some BibTeX files...
	\immediate\openout\elibcitation=\jobname_elib.aux%                           % ... ... In the elib.aux file
	\immediate\write\elibcitation{\@percentchar.  Style of BibTeX entries}%      % ... ... ... Put the style
	\immediate\write\elibcitation{\@backslashchar bibstyle\string{plainurl\string}}%%..... ... -> use plain url to also print the doi!
	\immediate\write\elibcitation{\@percentchar.  Source of BibTeX entries}%     % ... ... ... Put the source
	\immediate\write\elibcitation{\@backslashchar bibdata\string{elib\string}}%  % ... ... ... .
	\immediate\write\elibcitation{\@percentchar.  Generate citations}%           % ... ... ... Put the citation
	\immediate\write\elibcitation{\@backslashchar citation\string{*\string}}%    % ... ... ... 
	\immediate\closeout\elibcitation%                                            % ... ... .done
	\immediate\openout\elibcitation=\jobname_elib.bbl%                           % ... ... In the elib.bbl file
	\immediate\write\elibcitation{\@percentchar.  This is a dummy file!}%        % ... ... ... Put some dummy for now
	\immediate\write\elibcitation{\@backslashchar PackageWarningNoLine\string{elib\string}\string{Please run bibtex elib!\string}}%
	\immediate\closeout\elibcitation\relax%                                      % ... ... .done
	\execute{bibtex \jobname_elib}%                                              % ... Run bibtex on our files
	\def\elib@citation{\elib@head@citation%                                      % ... Redefine the citation notice!
		\WithSuffix\newcommand\section*[2][]{}%                                    % ... ... Remove section entry
		\renewcommand\@bibitem[1]{\gdef\elib@name{####1}%                          % ... ... Make \bibitem save the key to \elib@name
		                          \item}%                                          % ... ... ... and only issue \item
		\input{\jobname_elib.bbl}\par%                                             % ... ... Input the bbl file
		\framebox[\textwidth][l]{%                                                 % ... ... Output the source bib file
			\lstset{morecomment=[is]{\%}{\^^M}}%                                     % ... ... ... Make comments be not output
			\lstinputlisting[nolol=true,%                                            % ... ... ... Without list-of-listings entry
			                 basicstyle=\tiny\ttfamily,%                             % ... ... ... In small truetype fonts
			                 breaklines=true, %                                      % ... ... ... Breaking lines
			                 columns=flexible, %                                     % ... ... ... Not inserting additional spaces
			                 emptylines=0]{elib.bib}%                                % ... ... ... Omitting empty lines
		}%                                                                         % ... ... .done
	}%                                                                           % ... .done
}{}%                                                                           % .done
}

%
% Finally... Define the cover page!
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Add the cover page to the document using the etoolbox \AfterEndPreamble
\RequirePackage{etoolbox}
\AfterEndPreamble{\elib@coverpage}

% Define the coverpage
\RequirePackage{color}
\def\elib@coverpage{
	%\newgeometry{left=3cm,bottom=0.1cm}%               % Enlarge this page's margins
	\@ifundefined{hypersetup}{}{%                      % If the hyperref package is loaded
		\hypersetup{pageanchor=false}}%                  % ... No pageachors for preventing warnings
	\thispagestyle{empty}%                             % No headings/footers on the cover page
	{%                                                 % Typset the elib cover page with
		\fontfamily{pfr}\selectfont\noindent%            % ... our nice frutiger font
		\begin{minipage}[t]{\textwidth}%                 % Use a minipage for ...
			{%                                             % Some text on top
				\noindent%                                   % ... in normal font
				Publications of the DLR%                     % ... about elib
				\hfill%                                      % ... and
				\includegraphics[height=1.0em]{elib}%        % ... its logo
			}%                                             % .done
			\vspace{0.5em}%                                % Some skip
			\hrule height 0.1em%                           % ... a line
			\vspace{0.5em}%                                % ... and more skip
			\noindent{\itshape%                            % Add some text
			This is the author's copy of the %             % ... about this copy
			publication as archived with the DLR's %       % .
			electronic library at http://elib.dlr.de. %    % .
			Please consult the original publication %      % .
			for citation.} %                               % .
			\\[1em]%                                       % Some skip
			~\vfill\noindent%                              % Distribute the text
			{%                                             % ... begin a group for fonts
				\def\and{\unskip, }%                         % ... ... define \and to be a comma for gogle scholar
				{\LARGE\bfseries  \elib@title   }~ \\[0.5em]%% ... ... output a big font title
				{\large           \elib@author  }~ \\[0.5em]%% ... ... output a slightly big author
				\ifx\@empty       \elib@abstract\else%       % ... ... if not empty
				{\small           \elib@abstract}~ \\[0.5em]%% ... ... ... output the abstract
				\fi%                                         % ... ... .done
				\ifx\@empty       \elib@keywords\else%       % ... ... if not empty
				{\small Keywords: \elib@keywords}~ \\[0.5em]%% ... ... ... output the keywords
				\fi%                                         % ... ... .done
			}%                                             % ... Done with group
		\end{minipage}%                                  % .done
		~\vfill\noindent%                                % Distribute the text
		\begin{minipage}[t]{\textwidth}%                 % Use a minipage for ...
			\elib@copyright%                               % ... the copyright notice
		\end{minipage}%                                  % .done
		\vfill\noindent%                                 % Distribute the text
		\vfill\noindent%                                 % Distribute the text
		\ifx\elib@citation\elib@empty\else%              % Only output the citation, if there
		\begin{minipage}[t]{\textwidth}%                 % Use a minipage for ...
			\elib@citation%                                % ... the citation
		\end{minipage}%                                  % .done
	}%                                                 % .end of frutiger
	\cleardoublepage%                                  % Clear the pages
	\@ifundefined{hypersetup}{}{%                      % If the hyperref package is loaded
		\hypersetup{pageanchor=true}}%                   % ... Re-enable pageachors 
	\setcounter{page}{1}%                              % Re-set the page numbers
	%\restoregeometry%                                  % Reset geometry to the one we had before
}


%
% Possibly load a given .tex file or a default class
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Load a default class, if no tex file is included
\ifelib@tex
	\renewcommand{\documentclass}[2][]{%           % Make \documentclass
		\expandafter\let\csname ver@#2.cls\endcsname\relax% ... forget that the class was possibly loaded before
		\PassOptionsToClass{#1}{#2}%                 % ... pass any options to the class
		\LoadClass{#2}%                              % ... load the class
	}%                                             % .done
	\input{\elib@tex}%
\else
	\LoadClass{article}
	\RequirePackage{geometry}
	\newgeometry{margin=2cm}
\fi


%
% That's it!
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
\endinput
% eof