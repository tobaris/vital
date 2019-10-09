package vital.service

import vital.mapper.VitalMapper
import vital.model.VitalModel
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class VitalService(private val mapper: VitalMapper) {

    fun find(): List<VitalModel> = mapper.find()
}
