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

<xsl:template match="subscriber">
   <txt:block linesAfter="1">Dear <xsl:value-of select="name"/>,</txt:block>
</xsl:template>

<xsl:template match="body">
   <txt:block linesAfter="1">Your Credit Limit is Changed. Details are :
</txt:block>
<txt:block linesAfter="1">
Account Number : <xsl:value-of select="accountno"/>
</txt:block>
<txt:block linesAfter="1">
Subscriber Number : <xsl:value-of select="subscribernumber"/> 
</txt:block>
<txt:block linesAfter="1">
Assigned Credit Limit : <xsl:value-of select="creditlimit"/> BD
</txt:block>
<txt:block linesAfter="1">
Previous Credit Limit : <xsl:value-of select="previouscreditlimit"/> BD
</txt:block>
<txt:block linesAfter="1">
Used Credit Limit : <xsl:value-of select="usedlimit"/> BD
</txt:block>

</xsl:template>

<xsl:template match="endbody">
   <txt:block linesAfter="1">Regards,<xsl:apply-templates/></txt:block>
</xsl:template>

<xsl:template match="fromuser">
   <txt:block linesAfter="1">EtisalCom Auto Generated EMail<xsl:apply-templates/></txt:block>
</xsl:template>


</xsl:stylesheet>

