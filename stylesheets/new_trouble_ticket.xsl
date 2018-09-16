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


<xsl:template match="body">
<txt:block linesAfter="1">
You have received new problem and defined in Trouble Ticket ID : <xsl:value-of
       select="ticketid"/>.
Details are :<xsl:value-of select="details"/>
</txt:block>
</xsl:template>

<xsl:template match="endbody">
   <txt:block linesAfter="1">Regards,<xsl:apply-templates/></txt:block>
</xsl:template>

<xsl:template match="fromuser">
   <txt:block linesAfter="1">EtisalCom Auto Generated EMail<xsl:apply-templates/></txt:block>
</xsl:template>


</xsl:stylesheet>
