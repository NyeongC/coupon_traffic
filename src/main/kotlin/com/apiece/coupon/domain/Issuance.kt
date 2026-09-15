package com.apiece.coupon.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint
import java.time.LocalDateTime

@Entity
@Table(
    name = "issuance"
)
class Issuance(
    @Column(name = "user_id", nullable = false)
    var userId: Long,

    @Column(name = "coupon_id", nullable = false)
    var couponId: Long,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    var status: IssuanceStatus = IssuanceStatus.ISSUED,

    @Column(name = "issued_at", nullable = false, updatable = false)
    var issuedAt: LocalDateTime,

    @Column(name = "expires_at", nullable = false)
    var expiresAt: LocalDateTime,

    @Column(name = "used_at")
    var usedAt: LocalDateTime? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
) {
}