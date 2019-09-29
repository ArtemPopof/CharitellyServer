package ru.abbysoft.charitelly.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.NoSuchElementException

@RestController
class Controller {

    private val random = Random(System.currentTimeMillis())

    @Autowired
    private lateinit var projectRepository : ProjectsRepository

    @RequestMapping("/")
    fun index() : String {
        val randId = random.nextLong()
        return """
            This is Charitelly REST api index page!
             <br>
             <a href='google.com'>about Charitelly</a>
             <br>
             <a href='getProject/?id=${randId}'>get Project</a>
        """
    }

    fun getAllProjects() {
    }

    @GetMapping("/project/get")
    fun getPlace(@RequestParam("id") id : Long) : Project? {
        return try {
            projectRepository.findById(id).get()
        } catch (e : NoSuchElementException) {
            return null
        }
    }

    @GetMapping("/project/getAll")
    fun getAllPlaces() : Iterable<Project> {
        return projectRepository.findAll()
    }

    @PostMapping("/project/add")
    fun addPlace(@RequestBody place: Project) {
        projectRepository.save(place)
    }
}