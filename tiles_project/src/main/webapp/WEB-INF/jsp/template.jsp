<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
	<table  border=1 style="height:100%;width:100%; position: absolute; top: 0; bottom: 0; left: 0; right: 0;border:5px solid">
	
		<tbody>
			<tr id="header" >
			<td colspan="2">
				<tiles:insertAttribute name="header" />
			</td>
			</tr>

			<tr id="mainBody">
				<th rowspan="2" id="menu"><tiles:insertAttribute name="menu" /></th>
				<td id="content"><tiles:getAsString name="content" /></td>
			</tr>
			<tr id="body">
			<td>
				<tiles:getAsString name="body" />
			</td>
			</tr>

			<tr id="footer">
			<td colspan="2">
				<tiles:insertAttribute name="footer" />
			</td>
			</tr>
		</tbody>
	</table>
</body>
</html>