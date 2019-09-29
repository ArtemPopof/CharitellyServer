package ru.abbysoft.charitelly.server

import javax.persistence.*

@Entity
data class Project (
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        val id: Long,

        val name: String,
        val headerImageUrl: String,
        val description : String
)