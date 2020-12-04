package com.lambdaschool.piggybank.respositories;

import com.lambdaschool.piggybank.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> //tell the model and the data type of the model's primary key - requirement of crud repository we have to list classes
{
}
