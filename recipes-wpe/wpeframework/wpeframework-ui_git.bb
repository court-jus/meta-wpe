SUMMARY = "WPE Framework User Interface"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

require wpeframework-plugins.inc

SRC_URI = "git://github.com/WebPlatformForEmbedded/WPEFrameworkUI.git"
SRCREV = "8b17a00032760d6257b45bdecccf29285896960c"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	rm -rf ${D}${datadir}/WPEFramework/Controller/UI/*
	mkdir -p ${D}${datadir}/WPEFramework/Controller/UI
	cp -r ${S}/build/* ${D}${datadir}/WPEFramework/Controller/UI
}

FILES_${PN} += "${datadir}/WPEFramework/Controller/UI/*"
