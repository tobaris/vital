package vital.mapper

import org.apache.ibatis.annotations.Mapper
import vital.model.VitalModel

@Mapper
interface VitalMapper {
    fun find(): List<VitalModel>
}

