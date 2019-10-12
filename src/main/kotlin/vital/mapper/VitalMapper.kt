package vital.mapper

import org.apache.ibatis.annotations.Mapper
import vital.model.VitalModel
import org.apache.ibatis.annotations.Select

@Mapper
interface VitalMapper {
    @Select("""
        SELECT
            id, name, price, type
        FROM
            item
        ORDER BY
            id DESC
    """)
    fun find(): List<VitalModel>
}

