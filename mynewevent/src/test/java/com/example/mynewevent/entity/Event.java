package com.example.mynewevent.entity;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 100)
	@Size(min = 5, max = 100, message = "Title must be between 5 and 100 characters long")
	@NotBlank(message = "Title cannot be blank")
	private String title;

	@Column(length = 1000)
	@Size(min = 10, max = 1000, message = "Description must be between 10 and 1000 characters long")
	private String description;

	//image

	@NotBlank(message = "Link cannot be blank")
	private String link;

	@NotNull
	private double startingEntryPrice;

	//@NotNull
	//country, state, city API

	@NotNull
	private LocalDateTime dateTime;

	@ManyToOne(fetch = FetchType.LAZY)
	private User organizer;

	@ManyToMany(mappedBy="events")
	private Set<User> participants;

	//private Set<String> tags;

}