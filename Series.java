import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "series")
public class Series {
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "id")
	private int id;
	
	@Nullable
	@ColumnInfo(name = "creationDate")
	private String creationDate;
	
	@Nullable
	@ColumnInfo(name = "title")
	private String title;

	@Nullable
	@ColumnInfo(name = "personage")
	private String ;
	
	@ColumnInfo(name = "score")
	private int score;	
	
    
	public Series(@Nullable String creationDate, @Nullable String title, @Nullable String personage, int score) {
		this.creationDate = creationDate;
		this.title = title;
		this.personage = personage;
		this.score = score;
	}
	

	public int getId() {
		return id;
	}

	public void setId(@NonNull int id) {
		this.id = id;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(@Nullable String creationDate) {
		this.creationDate = creationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(@Nullable String title) {
		this.title = title;
	}

	public String getPersonage() {
		return personage;
	}

	public void setPersonage(@Nullable String personage) {
		this.personage = personage;
