--- lua script that findes the latex source file
--- is part of jobpath.sty

--- read logfile until ** is found
repeat
	line = file:read("*line")
until line:byte(2,3)==string.byte("**")

toParse = ""
line = file:read("*line")
while line:byte(1,5)~=string.byte("LaTeX") do
	toParse = toParse .. line
	line = file:read("*line")
end


--- find last slash
ind_brace     = 1
if toParse:byte(2,2) == string.byte('"') then
  ind_brace   = 2
end
ind_lastslash = toParse:find('/[^/]*$')
ind_texext    = toParse:find('.tex')

--- get info
jobpathname = toParse:sub(ind_brace+1,     ind_texext-1)
jobpath     = toParse:sub(ind_brace+1,     ind_lastslash-1)
jobpathfile = toParse:sub(ind_lastslash+1, ind_texext-1)
