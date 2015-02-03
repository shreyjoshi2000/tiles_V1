<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
<div id="header">
    <div id="headerTitle"><tiles:insertAttribute name="header" /></div>
</div>
<div id="menu">
    <tiles:insertAttribute name="menu" />
</div>
<div id="content">
    <tiles:insertAttribute name="content" />
</div>
<div id="body">
    <tiles:insertAttribute name="body" />
</div>

<div id="footer">
    <tiles:insertAttribute name="footer" />
</div>
</body>
</html>