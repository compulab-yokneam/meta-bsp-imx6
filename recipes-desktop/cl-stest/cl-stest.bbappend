FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = "file://fbtest.sh"

do_installi_append() {
    install 0755 ${S}/fbtest.sh ${D}/opt/compulab/cl-stest/*
}
