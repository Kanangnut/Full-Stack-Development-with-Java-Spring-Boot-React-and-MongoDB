package dev.kanangnuts.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
Footer
        © 2023 GitHub, Inc.
        Footer navigation
        Terms