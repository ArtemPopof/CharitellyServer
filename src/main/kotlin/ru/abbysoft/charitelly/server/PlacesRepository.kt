package ru.abbysoft.charitelly.server

import org.springframework.data.repository.CrudRepository

interface ProjectsRepository : CrudRepository<Project, Long>