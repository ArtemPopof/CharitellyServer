package ru.abbysoft.rehearsapp.server.db

import ru.abbysoft.charitelly.server.Project

interface Database {

    fun getProject(id : Long) : Project?
    fun getProjects() : ArrayList<Project>

    fun addProject(project : Project)
}