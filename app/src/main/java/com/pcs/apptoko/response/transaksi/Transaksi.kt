package com.pcs.apptoko.response.transaksi

import java.sql.DataTruncation

data class Transaksi(
    val admin_id: String,
    val id: String,
    val tanggal: String,
    val total: String
)
