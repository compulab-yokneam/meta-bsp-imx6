LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "https://github.com/compulab-yokneam/bin/raw/master/rootfs/lib/firmware/brcm/480-${PV}.tar.bz2"
SRC_URI[md5sum] = "c6a3119dec228a6fb65642be931ee6aa"
SRC_URI[sha256sum] = "e5755109f263a70738f59869704351a15c846a9a3963236ba9742eb4e0e67052"

S = "${WORKDIR}/lib"

inherit allarch

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	install -d ${D}${base_libdir}/firmware
	cp -rfv ${WORKDIR}/lib/firmware/brcm ${D}${base_libdir}/firmware/
	ln -s 4339.hcd ${D}${base_libdir}/firmware/brcm/BCM4335C0.hcd
	chown -R root:root ${D}${base_libdir}/firmware/brcm
	# Specify install commands here
	:
}

FILES_${PN} += "${base_libdir}/firmware/brcm"
