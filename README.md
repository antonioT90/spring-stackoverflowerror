Demo application to replicate StackOverFlowError when SpringContext shutdown.

To execute define the following environment variable

| ENV                                | DESCRIPTION                             |
|------------------------------------|-----------------------------------------|
| KAFKA_BINDER_BROKER_ENDPOINT_LIST  | kafka broker host:port                  |
| KAFKA_SASL_JAAS_CONFIG             | Optionally, the sasl-jaas-config string |
| KAFKA_TOPIC                        | the topic name                          |

Or Launch the following unit test:
`com.example.SpringStackoverflowerrorApplicationTests`

Once stopped the applicaiton, the StackOverflowError will appear inside the logs