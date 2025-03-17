package com.example.reviewTest;

public class Test_Dto 
{
	private Long id;
    private String name;
    private String description;

    public Test_Dto() {}

    public Test_Dto(Long id, String name, String description)
    {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);


}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
} 