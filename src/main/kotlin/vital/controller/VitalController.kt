package vital.controller

import vital.service.VitalService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class VitalController(private val service: VitalService) {

    @GetMapping("/")
    fun index(model: Model): String  {
        // model.addAttribute("modelList", service.find())
        // model.set("modelList", service.find())
        // Same as above .
        model["modelList"] = service.find()
        return "index"
    }
}
