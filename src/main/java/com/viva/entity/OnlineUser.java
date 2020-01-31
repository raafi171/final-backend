package com.viva.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

//import java.io.Serializable;

@RedisHash
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OnlineUser  {
    @Id
    private String id;
    private int status;
}
