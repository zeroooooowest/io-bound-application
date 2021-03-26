package class101.foo.io;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "post")
//@Entity(name = "post")
public class Post {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_seq")
//    @SequenceGenerator(name="post_id_seq", sequenceName = "post_id_seq", allocationSize = 1)
//    private Long id;

    @Id
    private String id;
    private String content;
}
