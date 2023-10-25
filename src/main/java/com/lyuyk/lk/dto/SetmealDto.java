package com.lyuyk.lk.dto;

import com.lyuyk.lk.entity.Setmeal;
import com.lyuyk.lk.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
