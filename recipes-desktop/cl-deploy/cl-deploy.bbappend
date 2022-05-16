SRC_URI_remove = "file://cl-deploy.cl-som-imx6ul"
PACKAGE_ARCH = "${MACHINE_ARCH}"
RDEPENDS_${PN}_remove = "u-boot-fw-utils"
COMPATIBLE_MACHINE = "(cl-som-imx6|cl-som-imx6ul|cm-fx6-evk)"
