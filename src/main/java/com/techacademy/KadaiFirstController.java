package com.techacademy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }
	@GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }
	@GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }
	@GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
	@GetMapping("/dayofweek/{val1}")
	public String dayofweek(@PathVariable String val1) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date date = dateFormat.parse(val1);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			// 日付から曜日を取得する
			int ans = calendar.get(Calendar.DAY_OF_WEEK);
			switch (ans) {
			case Calendar.SUNDAY: // Calendar.SUNDAY:1
				// 日曜日
				System.out.println("日曜日");
				return "日曜日";
//			    break;
			case Calendar.MONDAY: // Calendar.MONDAY:2
				// 月曜日
				System.out.println("月曜日");
				return "月曜日";
//			    break;
			case Calendar.TUESDAY: // Calendar.TUESDAY:3
				// 火曜日
				System.out.println("火曜日");
				return "火曜日";
//			    break;
			case Calendar.WEDNESDAY: // Calendar.WEDNESDAY:4
				// 水曜日
				System.out.println("水曜日");
				return "水曜日";
//			    break;
			case Calendar.THURSDAY: // Calendar.THURSDAY:5
				// 木曜日
				System.out.println("木曜日");
				return "木曜日";
//			    break;
			case Calendar.FRIDAY: // Calendar.FRIDAY:6
				// 金曜日
				System.out.println("金曜日");
				return "金曜日";
//			    break;
			case Calendar.SATURDAY: // Calendar.SATURDAY:7
				// 土曜日
				System.out.println("土曜日");
				return "土曜日";
//			    break;
			}
		} catch (ParseException e) {
			return "該当なし";
//			e.printStackTrace();
		}
		return "該当なし";
	}
}
