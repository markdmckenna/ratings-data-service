package io.javabrains.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRating {

	private String userId;
	private List<Rating> ratings;
	
	
	public void initData(String userId) {
        this.setUserId(userId);
        this.setRatings(Arrays.asList(
                new Rating("1234", 3),
                new Rating("5678", 4)
        ));
    }

}
