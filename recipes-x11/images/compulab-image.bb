DESCRIPTION = "CompuLab simple x11 demo image."

LICENSE = "MIT"

inherit core-image
inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

IMAGE_FEATURES += " \
    debug-tweaks \
    tools-profile \
    splash \
    nfs-server \
    nfs-client \
    tools-debug \
    ssh-server-dropbear \
    tools-testapps \
    hwcodecs \
    x11-base \
    dev-pkgs \
"

CORE_IMAGE_EXTRA_INSTALL += " \
    packagegroup-core-x11 \
    packagegroup-core-full-cmdline \
    packagegroup-tools-bluetooth \
    xf86-video-fbdev \
    xrdb \
"
# Expand the CORE_IMAGE_EXTRA_INSTALL
# with the custom package list
CORE_IMAGE_EXTRA_INSTALL += " \
"

# Uncoment lines: 38, 39 it for 4G image
# $(( $(( 4096 - 12 )) << 10 ))
# IMAGE_ROOTFS_SIZE = "4194304"
# IMAGE_OVERHEAD_FACTOR = "1.0"

# Uncoment lines: 43, 44 it for 8G image
# $(( $(( 8192 - 12 )) << 10 ))
# IMAGE_ROOTFS_SIZE = "8376320"
# IMAGE_OVERHEAD_FACTOR = "1.0"
