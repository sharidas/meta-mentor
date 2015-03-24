require recipes-connectivity/connman/connman.inc

SRC_URI  = "${KERNELORG_MIRROR}/linux/network/${BPN}/${BP}.tar.xz \
            file://0001-plugin.h-Change-visibility-to-default-for-debug-symb.patch \
            file://add_xuser_dbus_permission.patch \
            file://0001-Revert-dhcp-Keep-the-retry-timeout-nor-the-ipv4ll-ta.patch \
            file://0011-service-Connect-ethernet-networks-when-created.patch \
            "
SRC_URI[md5sum] = "6e07c93877f80bb73c9d4dbfc697f3fc"
SRC_URI[sha256sum] = "b1d5e7dd2652725906e220a8b0206477e97080e835272971e3b2fd10943c5c94"

RRECOMMENDS_${PN} = "connman-conf"
