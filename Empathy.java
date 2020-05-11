import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "empathies")

public class Empathy {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "empathyId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "creationDate")
    private String mCreationDate;

    public int getId() {
        return mId;
    }

    public void setId(@NonNull int id) {
        mId = id;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(@Nullable String creationDate) {
        mCreationDate = creationDate;
    }

    public String getAttitude() {
        return mAttitude;
    }

    public void setAttitude(@Nullable String attitude) {
        mAttitude = attitude;
    }

    public String getType() {
        return mType;
    }

    public void setType(@Nullable String type) {
        mType = type;
    }

    private String mCreationDate;
 
    private String mAttitude;

    private String mType;

    public int getEvaluation() {
        return mEvaluation;
    }

    public void setEvaluation(@NonNull int evaluation) {
        mEvaluation = evaluation;
    }

    private int mEvaluation;

    public Empathy(String creationDate, String attitude, String type, int evaluation) {
        mCreationDate = creationDate;
        mAttitude = attitude;
        mType = type;
        mEvaluation = evaluation;

    }



}
    






