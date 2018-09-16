<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
   xmlns:txt="http://www.comcerto.net">

<xsl:output method="xml"/>

<xsl:template match="/">
<txt:root lineWidth="65">
   <xsl:apply-templates/>
</txt:root>
</xsl:template>

<xsl:template match="icpartner">
   <txt:block linesAfter="1">Dear <xsl:value-of select="name"/>,</txt:block>
</xsl:template>

<xsl:template match="body">

<txt:block linesAfter="1">
Your Status is Changed to <xsl:value-of select="status"/>. Details are :
</txt:block>

<txt:block linesAfter="1">
Carrier Number : <xsl:value-of select="partnerid"/>
</txt:block>
<txt:block linesAfter="1">
Carrier Name : <xsl:value-of select="name"/>
</txt:block>
<txt:block linesAfter="1">
Carrier Type : <xsl:value-of select="partype"/> 
</txt:block>
<txt:block linesAfter="1">
Current Balance : <xsl:value-of select="currentbalance"/> USD
</txt:block>
<txt:block linesAfter="1">
Assigned Credit Limit : <xsl:value-of select="creditlimit"/> USD
</txt:block>
<txt:block linesAfter="1">
Used Limit : <xsl:value-of select="usedlimit"/> USD
</txt:block>
<txt:block linesAfter="1">
Credit Note Balance : <xsl:value-of select="creditbalance"/> USD
</txt:block>

</xsl:template>

<xsl:template match="endbody">
   <txt:block linesAfter="1">Regards,<xsl:apply-templates/></txt:block>
</xsl:template>

<xsl:template match="fromuser">
   <txt:block linesAfter="1">Terminus Auto Generated EMail<xsl:apply-templates/></txt:block>
</xsl:template>


</xsl:stylesheet>

