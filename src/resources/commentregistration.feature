Feature: Registration page
    @commentsreg
    Scenario:Comment on BBC Test Article

        Given User Navigated to BBC NewsArticlePage

        When User clicks on CommentButton

        Then User clicks on Registration Button

        And User completes registration
        When User login as existing user
       Then User comments on Test Article


