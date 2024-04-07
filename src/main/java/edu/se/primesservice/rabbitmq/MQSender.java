package edu.se.primesservice.rabbitmq;

@Component
public class MQSender {
 
    private final Queue queue;

    final RabbitTemplate rabbitTemplate;

    public MQSender(Queue queue, RabbitTemplate rabbitTemplate) {
        this.queue = queue;
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(int n, boolean isPrime) {
        String message =
            MessageFormat
                .format( pattern: "n: {0}, isprime: {1}"
                    , n, isPrime);
        rabbitTemplate.convertAndSend( routingKey: "primes", message);

}
